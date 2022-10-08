package com.example.KTTKPM_THBuoi4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.KTTKPM_THBuoi4.reponsitory.ChungNhanDAOImpl;
import com.example.KTTKPM_THBuoi4.reponsitory.ChuyenBayDAOImpl;
import com.example.KTTKPM_THBuoi4.reponsitory.MayBayDAOImpl;
import com.example.KTTKPM_THBuoi4.reponsitory.NhanVienDAOImpl;

@SpringBootApplication
public class KttkpmThBuoi4Application {
	@Bean
	public CommandLineRunner run(ChuyenBayDAOImpl chuyenBayDAOImpl, MayBayDAOImpl mayBayDAOImpl, NhanVienDAOImpl nhanVienDAOImpl,
			ChungNhanDAOImpl chungNhanDAOImpl) {
		return (ArgsAnnotationPointcut -> {
			
			
			
		});
	}
	public static void main(String[] args) {
		SpringApplication.run(KttkpmThBuoi4Application.class, args);
	}

}
