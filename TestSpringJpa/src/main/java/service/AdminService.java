package service;

import entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.AdminRepository;

import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    public Admin registerAdmin(Admin admin){
        return adminRepository.save(admin);
    }
    public Admin authenticateAdmin(Admin admin){
//        Optional<Admin> optional = adminRepository.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
//        if(optional.isPresent())
//            return optional.get();
//        return null;

        return adminRepository.findByEmailAndPassword(admin.getEmail(), admin.getPassword()).orElse(null);
    }
}
