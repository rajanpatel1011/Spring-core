package com.org;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TelecomServices {
 
	private List<String> location;
	private Set<String> url;
	private Map<String,String> credentials;
	
	public List<String> getLocation() {
		return location;
	}
	public void setLocation(List<String> location) {
		this.location = location;
	}
	public Set<String> getUrl() {
		return url;
	}
	public void setUrl(Set<String> url) {
		this.url = url;
	}
	public Map<String,String> getCredentials() {
		return credentials;
	}
	public void setCredentials(Map<String,String> credential) {
		this.credentials = credential;
	}
}
