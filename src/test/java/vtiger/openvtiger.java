package vtiger;


import org.testng.annotations.Test;

public class openvtiger {
	
	
	
    @Test
    public void testCreateOrganization() {
        // Step 1: Navigate to application
        String url = "https://localhost:8888";
        navigateToApplication(url);
    }
        
        
        private void navigateToApplication(String url) {
            System.out.println("Navigating to application: " + url);
            // Add actual navigation code here
        }
        
        
    }


