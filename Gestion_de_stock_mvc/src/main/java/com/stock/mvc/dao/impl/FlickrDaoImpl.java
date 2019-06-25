package com.stock.mvc.dao.impl;

import java.io.InputStream;

import javax.swing.JOptionPane;

import org.scribe.model.Token;
import org.scribe.model.Verifier;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;
import com.stock.mvc.dao.IFlickrDao;

public class FlickrDaoImpl implements IFlickrDao{

	private Flickr flickr;
	
	private UploadMetaData uploadMetaData = new UploadMetaData ();
	
	private String apiKey ="76eab93b33ca6d65651e67ea326318cf";
	
	private String sharedSecret = "ed262797a75b282c";
	
	private void connect() {
		
		flickr = new Flickr(apiKey, sharedSecret, new REST());
		Auth auth = new Auth();
		auth.setPermission(Permission.READ);
		auth.setToken("76eab93b33ca6d65651e67ea326318cf");
		auth.setTokenSecret("ed262797a75b282c");
		RequestContext requestContext = RequestContext.getRequestContext();
		requestContext.setAuth(auth);
		flickr.setAuth(auth);		
	}
	
	@Override
	public String savePhoto(InputStream photo, String title) throws Exception{
		connect();
		uploadMetaData.setTitle(title);
		String photoId = flickr.getUploader().upload(photo, uploadMetaData);
		return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
	}
	
	
	public void auth() {
		flickr = new Flickr(apiKey,sharedSecret, new REST());
		
		AuthInterface authInterface = flickr.getAuthInterface();
		
		Token token = authInterface.getRequestToken();
		System.out.println("token"+token);		
		
		String url = authInterface.getAuthorizationUrl(token, Permission.DELETE);
		System.out.println("SUIVEZ CET URL POUR AUTORISER");
		System.out.println(url);
		System.out.println("COLLER LE TOKEN QUI SERA DONNE");
		System.out.print(">>");
		
		String tokenKey = JOptionPane.showInputDialog(null);
		
		Token requestToken = authInterface.getAccessToken(token, new Verifier(tokenKey));
		System.out.println("Authentification succes");
		
		Auth auth= null;
		
		try {
			auth= authInterface.checkToken(requestToken);
		} catch (FlickrException e) {
			e.printStackTrace();
		}
	
	
		// Ce token peut etre utiliser jusqu'à changeement d'utilisateur
		  
		System.out.println("Token: "     + requestToken.getToken());
		System.out.println("Secret: "    + requestToken.getSecret());
		System.out.println("nsid: "      + auth.getUser().getId());
		System.out.println("RealName: "  + auth.getUser().getRealName());
		System.out.println("Username: "  + auth.getUser().getUsername());
		System.out.println("Permission: "+ auth.getPermission().getType());
	
	}
	
	
	

}
