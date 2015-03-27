
package vn.smartdev.app.entities;


import org.springframework.data.domain.AuditorAware;



public class AuditorAwareImpl implements AuditorAware<String> {

 
    public String getCurrentAuditor() {
        return "SYSTEM UPDATE USER 2";
    }


}
