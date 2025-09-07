package com.practice.practice.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practice.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	
	CloudVendor cloudVendor;
	
	@GetMapping("/{vendorId}")
	public Object getCloudVendorDetails(@PathVariable String vendorId) {
//		return new CloudVendor("C1", "vendor 1", "Address one", "xxxxxxx");
		 if (cloudVendor != null && cloudVendor.getVendorId().equals(vendorId)) {
	            return cloudVendor;
	        } else {
	            return "No Vendor Found with ID: " + vendorId;
	        }
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Created Successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		if (this.cloudVendor != null && this.cloudVendor.getVendorId().equals(cloudVendor.getVendorId())) {
            this.cloudVendor = cloudVendor;
            return "Cloud Vendor Updated Successfully";
        } else {
            return "Vendor ID mismatch or vendor not found.";
        }
	}
	
	@DeleteMapping("/{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable String vendorId) {
		if (this.cloudVendor != null && this.cloudVendor.getVendorId().equals(vendorId)) {
            this.cloudVendor = null;
            return "Cloud Vendor Deleted Successfully";
        } else {
            return "No Vendor Found with ID: " + vendorId;
        }
	}
	
}
