package com.heboot.hotel.controller;

import com.heboot.hotel.model.Hotel;
import com.heboot.hotel.service.HotelService;
import com.heboot.hotel.utils.GsonUtils;
import com.heboot.hotel.utils.HHotelErrorCode;

public class HotelController extends BaseController {

	/**
	 * 添加酒店
	 */
	public void add() {
		Hotel hotel = new Hotel();
		String name = getPara("name");
		String address = getPara("address");
		String tel = getPara("tel");
		String contacts = getPara("contacts");
		String describe = getPara("describe");
		hotel.setName(name);
		hotel.setAddress(address);
		hotel.setTel(tel);
		hotel.setContacts(contacts);
		hotel.setDescribe(describe);
		try {
			if (!HotelService.doAddHotel(hotel)) {
				sendResponse(false, HHotelErrorCode.STATUS_1005.getCode(),
						HHotelErrorCode.STATUS_1005.getDescribe(), "", "");
				return;
			}

			sendResponse(true, HHotelErrorCode.STATUS_2000.getCode(),
					HHotelErrorCode.STATUS_2000.getDescribe(), GsonUtils
							.getGson().toJson(hotel), "");

		} catch (Exception e) {
			sendResponse(false, HHotelErrorCode.STATUS_5000.getCode(),
					HHotelErrorCode.STATUS_5000.getDescribe(), "", e.toString());
		}
	}

}
