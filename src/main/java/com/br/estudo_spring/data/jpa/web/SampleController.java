/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.br.estudo_spring.data.jpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.estudo_spring.data.jpa.domain.City;
import com.br.estudo_spring.data.jpa.service.CitySearchCriteria;
import com.br.estudo_spring.data.jpa.service.CityService;
import com.br.estudo_spring.data.jpa.service.HotelService;

@Controller
public class SampleController {

	@Autowired
	private CityService cityService;
	
	@Autowired
	private HotelService hotelService;
	
	
	private CitySearchCriteria citySearchCriteria;
	
	
	@RequestMapping("/")
	@ResponseBody
	@Transactional(readOnly = true)
	public String helloWorld() {
		return this.cityService.getCity("Bath", "UK").getName();
	}
	
	@RequestMapping("/listaCidades")
	@ResponseBody
	@Transactional(readOnly = true)
	public Page<City> listCidades() {
		citySearchCriteria = new CitySearchCriteria("London");
		return this.cityService.findCities(citySearchCriteria, new PageRequest(0, 10));
	}
	
	/*@RequestMapping("/listaHoteisNY")
	@ResponseBody
	@Transactional(readOnly = true)
	public Page<City> listCidadesNY() {
		citySearchCriteria = new CitySearchCriteria("London");
		return this.hotelService.(citySearchCriteria, new PageRequest(0, 10));
	}*/
}
