package com.example.KTTKPM_THBuoi4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KTTKPM_THBuoi4.entity.*;
import com.example.KTTKPM_THBuoi4.reponsitory.*;

@RestController
@RequestMapping("/api/chuyenBay")
public class ChuyenBayController {
	@Autowired
	ChuyenBayDAOImpl chuyenBayDAOImpl;
	
	@GetMapping("/getChuyenBayDiDAD")
	public List<ChuyenBay> listChuyenBayDAD(String name){
		return chuyenBayDAOImpl.listChuyenBayDAD("DAD");
		
	}
	@GetMapping("/listChuyenBay10To8")
	public List<ChuyenBay> listChuyenBay10To8(){
		return chuyenBayDAOImpl.listChuyenBay10To8();
		
	}
	@GetMapping("/listChuyenBayDenVaDi")
	public List<ChuyenBay> listChuyenBayDenVaDi(String di,String den){
		return chuyenBayDAOImpl.listChuyenBayDenVaDi("SGN", "BMV");
		
	}
	@GetMapping("/numChuyenBaySGN")
	public int numChuyenBaySGN() {
		return chuyenBayDAOImpl.numChuyenBaySGN();
		
	}
	@GetMapping("/listABA")
	public List<ChuyenBay> listABA(){
		return chuyenBayDAOImpl.listABA();
		
	}
	@GetMapping("/listGroupGaDi")
	public List<Object[]> listGroupGaDi(){
		return chuyenBayDAOImpl.listGroupGaDi();
		
	}
	@GetMapping("/list1200")
	public List<ChuyenBay> list1200(){
		return chuyenBayDAOImpl.list1200();
		
	}
	@GetMapping("/list1200GroupGaDi")
	public List<Object[]> list1200GroupGaDi(){
		return chuyenBayDAOImpl.list1200GroupGaDi();
		
	}
	@GetMapping("/listMaxTamBayOfBoeing")
	public List<Object[]> listMaxTamBayOfBoeing(String loai){
		return chuyenBayDAOImpl.listMaxTamBayOfBoeing("Boeing");
		
	}
	@GetMapping("/listSumChiPhi")
	public List<Object[]> listSumChiPhi(){
		return chuyenBayDAOImpl.listSumChiPhi();
		
	}
}
