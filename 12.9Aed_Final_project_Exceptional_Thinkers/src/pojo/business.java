/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author sangh
 */
public class business {
    private studentDirectory studentCatalog;

    public business() {
        studentCatalog = new studentDirectory();
    }

    public studentDirectory getStudentCatalog() {
        return studentCatalog;
    }

    public void setStudentCatalog(studentDirectory studentCatalog) {
        this.studentCatalog = studentCatalog;
    }
    
}
