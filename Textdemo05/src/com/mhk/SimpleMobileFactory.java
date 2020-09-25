package com.mhk;

public class SimpleMobileFactory extends MenuFactory {

	@Override
	public Mobile create(String typeOfMobile) {
		
		if(typeOfMobile == null){
	        return null;
	    }        
	    if(typeOfMobile.equalsIgnoreCase("IPHONE")){
	    	return new IPhone();
        } else if(typeOfMobile.equalsIgnoreCase("Huawei")){
	        return new Huawei();
	    } 
	    return null;
	}

}
