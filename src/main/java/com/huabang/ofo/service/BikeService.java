package com.huabang.ofo.service;

import com.alibaba.fastjson.JSONObject;

public interface BikeService {

	JSONObject useBike(String shareId, String telePhone);

	JSONObject endUseBike(String shareId, String pot);

}
