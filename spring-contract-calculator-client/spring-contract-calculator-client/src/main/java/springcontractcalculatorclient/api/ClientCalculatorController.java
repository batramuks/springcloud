package springcontractcalculatorclient.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import springcontractcalculatorclient.model.DataRequest;

@RestController
public class ClientCalculatorController implements ClientCalulatorInterf {

	@Autowired
	private RestTemplate restTemplate;

	
	public ResponseEntity<?> getAddition(DataRequest dataRequest) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Content-Type", "application/json");
		String uri="http://localhost:9000/calculate/add";
		ResponseEntity<Long> responseEntity = restTemplate.postForEntity(uri, dataRequest, Long.class);
		
		return new ResponseEntity<Long>(responseEntity.getBody(), HttpStatus.OK);
	}

}
