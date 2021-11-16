package lk.ijse.spring.service;

import lk.ijse.spring.dto.MaintainceDto;

import java.util.List;

public interface MaintainanceService {
    void saveMaintainance(MaintainceDto dto);
    void updateMaintainance(MaintainceDto dto);
    void deleteMaintainance(String id);
    MaintainceDto searchMaintainance(String id);
    List<MaintainceDto> getAllMaintainance();
    String getLastID();
}
