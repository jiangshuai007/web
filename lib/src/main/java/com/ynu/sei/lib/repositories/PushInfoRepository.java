package com.ynu.sei.lib.repositories;

import com.ynu.sei.lib.domain.PushInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PushInfoRepository extends JpaRepository<PushInfo, String> {
}
