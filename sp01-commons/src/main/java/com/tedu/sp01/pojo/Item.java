package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private Integer id; //订单id
	private String name;//订单所属的用户
	private Integer number;//订单中的包含的商品列表
	
}

