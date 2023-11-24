package com.omrbranch.payload.address;

import com.omrbranch.pojo.address.AddAddress_Input_Pojo;
import com.omrbranch.pojo.address.DeleteUserAddress_Input_Pojo;
import com.omrbranch.pojo.address.UpdateUserAddress_Input_pojo;

public class AddressPayLoad {
	public AddAddress_Input_Pojo addAddressPayLoad(String first_name, String last_name, String mobile, String apartment, int state,
			int city, int country, String zipcode, String address, String address_type) {
		AddAddress_Input_Pojo adress_Input_pojo=new AddAddress_Input_Pojo(first_name, last_name, mobile, apartment, state, city, country, zipcode, address, address_type);
		return adress_Input_pojo;
	}
	public UpdateUserAddress_Input_pojo updateAddressPayLoad(String address_id, String first_name, String last_name, String mobile,
			String apartment, int state, int city, int country, String zipcode, String address, String address_type) {
		UpdateUserAddress_Input_pojo adress_Input_pojo=new UpdateUserAddress_Input_pojo(address_id, first_name, last_name, mobile, apartment, state, city, country, zipcode, address, address_type);
		return adress_Input_pojo;		

	}

	public DeleteUserAddress_Input_Pojo deletePayLoad(String addressId) {
		DeleteUserAddress_Input_Pojo deleteUserAddress_Input_Pojo=new DeleteUserAddress_Input_Pojo(addressId);
		return deleteUserAddress_Input_Pojo;
		

	}

}
