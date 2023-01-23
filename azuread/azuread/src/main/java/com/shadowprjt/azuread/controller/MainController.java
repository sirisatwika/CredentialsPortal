package com.shadowprjt.azuread.controller;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MainController {
	@Autowired
	RestTemplate rt1;
	
	public String getAccessToken() throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("grant_type","client_credentials");
		map.add("client_id", "39971172-0873-4d99-9ca6-a6adb4a7fb5e");
		map.add("client_secret", "6WX8FanYL+GwR6SjocdbPLFC9/NpeOwXJOs+w5JZpGo=");
		map.add("client_resource", "https://graph.windows.net/");
		
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		
		final String baseUrl ="https://login.microsoftonline.com/badgingportalqa.onmicrosoft.com/oauth2/token";
		URI accessuri = new URI(baseUrl);
			
		final HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<MultiValueMap<String, String>>(map ,
		        accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.POST, entity,
	            String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, String> accessmap = mapper.readValue(result.getBody(), Map.class);

		return accessmap.get("access_token");
	}
	
	@GetMapping("/users")
	public Object getAllUsers() throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/users/?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.GET, entity,
	            String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, ?> accessmap = mapper.readValue(result.getBody(), Map.class);
		
		return accessmap.get("value");
	}
	
	@GetMapping("/users/{uname}")
	public Map<String, ?> getUser(@PathVariable String uname) throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/users/"+uname+"?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.GET, entity,
	            String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, ?> accessmap = mapper.readValue(result.getBody(), Map.class);
		
		return accessmap;
	}
	
	@GetMapping("/users/{uname}/{udata}")
	public Map<String, ?> getUserData(@PathVariable String uname,@PathVariable String udata) throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/users/"+uname+"/"+udata+"?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.GET, entity,
	            String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, ?> accessmap = mapper.readValue(result.getBody(), Map.class);
		
		return accessmap;
	}
	
	@PostMapping("/users")
	public String addUser(@RequestBody String body) throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_JSON);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/users?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(body,accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.POST, entity,
	            String.class);
		
		return result.getBody();
	}
	
	@PatchMapping("/users/{uname}")
	public String updateUser(@RequestBody String body,@PathVariable String uname) throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_JSON);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/users/"+uname+"?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(body,accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.PATCH, entity,
	            String.class);
		
		return result.getBody();
	}
	
	@DeleteMapping("/users/{uname}")
	public String deleteUser(@PathVariable String uname) throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/users/"+uname+"?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.DELETE, entity,
	            String.class);
		
		return result.getBody();
	}
	
	@GetMapping("/groups")
	public Object getAllGroups() throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/groups/?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.GET, entity,
	            String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, ?> accessmap = mapper.readValue(result.getBody(), Map.class);
		
		return accessmap.get("value");
	}
	
	@GetMapping("/groups/{gname}")
	public Map<String, ?> getGroup(@PathVariable String gname) throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/groups/"+gname+"?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.GET, entity,
	            String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, ?> accessmap = mapper.readValue(result.getBody(), Map.class);
		
		return accessmap;
	}
	
	@GetMapping("/domains")
	public Object getAllDomains() throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/domains/?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.GET, entity,
	            String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, ?> accessmap = mapper.readValue(result.getBody(), Map.class);
		
		return accessmap.get("value");
	}
	
	@GetMapping("/domains/{dname}")
	public Map<String, ?> getDomain(@PathVariable String dname) throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/domains/"+dname+"?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.GET, entity,
	            String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, ?> accessmap = mapper.readValue(result.getBody(), Map.class);
		
		return accessmap;
	}
	
	@GetMapping("/contacts")
	public Object getAllContacts() throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/contacts/?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.GET, entity,
	            String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, ?> accessmap = mapper.readValue(result.getBody(), Map.class);
		
		return accessmap.get("value");
	}
	
	@GetMapping("/contacts/{cname}")
	public Map<String, ?> getContact(@PathVariable String cname) throws URISyntaxException, JsonParseException, JsonMappingException, IOException {
		HttpHeaders accessheaders = new HttpHeaders();
		accessheaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		accessheaders.setBearerAuth(getAccessToken());
		
		final String baseUrl ="https://graph.windows.net/badgingportalqa.onmicrosoft.com/contacts/"+cname+"?api-version=1.6";
		URI accessuri = new URI(baseUrl);
			
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final HttpEntity entity = new HttpEntity(accessheaders);
		ResponseEntity<String> result = rt1.exchange(
	            accessuri, HttpMethod.GET, entity,
	            String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, ?> accessmap = mapper.readValue(result.getBody(), Map.class);
		
		return accessmap;
	}
}
