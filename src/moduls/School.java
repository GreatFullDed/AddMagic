package moduls;
// Generated 24.02.2021 14:05:56 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * School generated by hbm2java
 */
@Entity
@Table(name="school"
    ,catalog="dndthings2"
)
public class School  implements java.io.Serializable {


     private int idSchool;
     private String name;
     private Set<Magic> magics = new HashSet<Magic>(0);

    public School() {
    }

	
    public School(int idSchool) {
        this.idSchool = idSchool;
    }
    public School(int idSchool, String name, Set<Magic> magics) {
       this.idSchool = idSchool;
       this.name = name;
       this.magics = magics;
    }
   
     @Id 

    
    @Column(name="idSchool", unique=true, nullable=false)
    public int getIdSchool() {
        return this.idSchool;
    }
    
    public void setIdSchool(int idSchool) {
        this.idSchool = idSchool;
    }

    
    @Column(name="Name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="school")
    public Set<Magic> getMagics() {
        return this.magics;
    }
    
    public void setMagics(Set<Magic> magics) {
        this.magics = magics;
    }

    @Override
    public String toString() {
        return this.getName();
    }


    


}


