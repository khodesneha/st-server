/**
 * 
 */
package com.stores.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.store.entity.StoreAssociate;
import com.store.entity.StoreDetails;

/**
 * @author Prasad Khode
 *
 */
public class TestStoreDetails {

	private final HttpClient httpclient = HttpClientBuilder.create().build();

//	@Test
	public void setupStoreTest() {
		try {
			URIBuilder builder = new URIBuilder().setScheme("http")
					.setHost("localhost").setPort(9000)
					.setPath("/storeDetails/getById/1");

			HttpUriRequest httpUriRequest = new HttpGet(builder.build());

			HttpResponse httpResponse = this.httpclient.execute(httpUriRequest);

			String response = EntityUtils.toString(httpResponse.getEntity());
			
			Gson gson = new GsonBuilder().create();
			
			StoreDetails storeDetails = gson.fromJson(response, StoreDetails.class);
			storeDetails.setStoreId(null);
			storeDetails.setStoreName("store_name3");
			
			builder = new URIBuilder().setScheme("http")
					.setHost("localhost").setPort(9000)
					.setPath("/storeAssociate/getById/1");

			httpUriRequest = new HttpGet(builder.build());

			httpResponse = this.httpclient.execute(httpUriRequest);

			response = EntityUtils.toString(httpResponse.getEntity());
			
			StoreAssociate storeAssociate = gson.fromJson(response, StoreAssociate.class);

			storeAssociate.setStoreAssociateId(null);
			storeAssociate.setStoreDetails(null);
			storeAssociate.setEmailId("user3@test.com");

			storeDetails.setStoreAssociate(storeAssociate);
			System.out.println("\n\n" + storeDetails + "\n\n");

			builder = new URIBuilder().setScheme("http")
					.setHost("localhost").setPort(9000)
					.setPath("/storeDetails/save2");

			HttpPost httpPost = new HttpPost(builder.build());
			httpPost.setEntity(new StringEntity(gson.toJson(storeDetails)));

			httpResponse = this.httpclient.execute(httpPost);

			BufferedReader rd = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
			String line = "";
			while ((line = rd.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
