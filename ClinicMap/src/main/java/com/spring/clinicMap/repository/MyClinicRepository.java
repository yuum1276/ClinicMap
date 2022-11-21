package com.spring.clinicMap.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.clinicMap.entity.Member;
import com.spring.clinicMap.entity.MyClinic;
import com.spring.clinicMap.entity.MyClinicId;


public interface MyClinicRepository extends JpaRepository<MyClinic, MyClinicId>{
	
	Page<MyClinic> findByMember(Member member, Pageable pageable);
}
