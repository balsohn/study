package kr.co.admin.dto;

import lombok.Data;

@Data
public class ProductDTO {
	private String pcode,pimg,dimg,title,writeday;
	private int id,price,halin,su,baeprice,baeday,juk,pansu;
	private double star;
	
}