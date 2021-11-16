package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.MaintainceDto;
import lk.ijse.spring.entity.Maintainance;
import lk.ijse.spring.repo.MaintainanceRepo;
import lk.ijse.spring.service.MaintainanceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MaintainanceServiceImpl implements MaintainanceService {
    @Autowired
    MaintainanceRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveMaintainance(MaintainceDto dto) {
        Maintainance maintainance = mapper.map(dto, Maintainance.class);
        maintainance.setMaintainanceID(getLastID());
        repo.save(maintainance);
    }

    @Override
    public void updateMaintainance(MaintainceDto dto) {

    }

    @Override
    public void deleteMaintainance(String id) {

    }

    @Override
    public MaintainceDto searchMaintainance(String id) {
        return null;
    }

    @Override
    public List<MaintainceDto> getAllMaintainance() {
        return null;
    }

    @Override
    public String getLastID() {
        return null;
    }
}
