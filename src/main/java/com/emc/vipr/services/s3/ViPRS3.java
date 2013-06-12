/**
 * TODO: Copyright here
 */
package com.emc.vipr.services.s3;

import java.io.File;
import java.io.InputStream;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.emc.vipr.services.s3.model.*;
import com.emc.vipr.services.s3.model.GetFileAccessResult;

/**
 * @author cwikj
 *
 */
public interface ViPRS3 {	
	public UpdateObjectResult updateObject(String bucketName, String key, File file, long startOffset) throws AmazonClientException, AmazonServiceException;
	public UpdateObjectResult updateObject(String bucketName, String key, InputStream input, ObjectMetadata metadata, long startOffset) throws AmazonClientException, AmazonServiceException;
	public UpdateObjectResult updateObject(UpdateObjectRequest request) throws AmazonClientException, AmazonServiceException;
	
	public AppendObjectResult appendObject(String bucketName, String key, File file) throws AmazonClientException, AmazonServiceException;
	public AppendObjectResult appendObject(String bucketName, String key, InputStream input, ObjectMetadata metadata) throws AmazonClientException, AmazonServiceException;
	public AppendObjectResult appendObject(AppendObjectRequest request) throws AmazonClientException, AmazonServiceException;
	
	public PutAccessModeResult putAccessMode(PutAccessModeRequest request) throws AmazonClientException, AmazonServiceException;
	
	public GetAccessModeResult getAccessMode(String bucketName) throws AmazonClientException, AmazonServiceException;
	
	public GetFileAccessResult getFileAccess(GetFileAccessRequest request) throws AmazonClientException, AmazonServiceException;
}
