package net.javaguides.mssql.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ALYFTWAY")
public class Alley {

    @Id
    @Column(name = "BILL_TYPE", nullable = false)
    private String billType;
    @Column(name = "WARD", nullable = false)
    private String ward;
    @Column(name = "SECTION", nullable = false)
    private String section;
    @Column(name = "BLOCK", nullable = false)
    private String block;
    @Column(name = "LOT", nullable = false)
    private String lot;
    public Alley() {

    }

    public Alley(String billType, String ward, String section,String block,String lot) {
        this.billType = billType;
        this.ward = ward;
        this.section = section;
        this.block = block;
        this.lot = lot;

    }


    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }


    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }


    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


    public String getBlock() {
        return block;
    }

    public void setEmailId(String block) {
        this.block = block;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }
    @Override
    public String toString() {
        return "Alley [billtype=" + billType + ", ward=" + ward + ", section=" + section + ", block=" + block
                + "]";
    }

}
