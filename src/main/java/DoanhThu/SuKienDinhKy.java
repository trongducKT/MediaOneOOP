/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import IO.IO;
import ThongBao.ThongBao;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author XPS
 */
public class SuKienDinhKy extends SuKien {

    protected LocalDateTime ngayTiepTheo;

    public SuKienDinhKy(String tenSK, String loaiSK, LocalDateTime ngay) {
        super(tenSK, loaiSK);
        this.ngayTiepTheo = ngay;
    }

    public void themThongBao() {
        IO IO = new IO();
        ArrayList<ThongBao> dsThongBao = IO.docThongBao();
        dsThongBao.add(new ThongBao(this.getTenSuKien(), false));
        IO.ghiThongBao(dsThongBao);
    }

}
