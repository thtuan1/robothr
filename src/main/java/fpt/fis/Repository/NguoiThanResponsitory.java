package fpt.fis.Repository;

import fpt.fis.Model.NguoiThan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NguoiThanResponsitory  extends JpaRepository<NguoiThan,Long> {
    @Query("select nt from NguoiThan nt"+
            " where ungvien_id = :ungvien_id")
    List<NguoiThan> getAllNguoiThan(@Param("ungvien_id") Long ungvien_id);
}
