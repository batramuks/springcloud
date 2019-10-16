package springcontractcalculatorclient.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springcontractcalculatorclient.model.DataRequest;

/**
 * @author batra.m
 *
 */
public interface ClientCalulatorInterf {

	@RequestMapping(value = "/calculate/add", produces = {"application/json" }, consumes = {"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> getAddition(@RequestBody DataRequest dataRequest);

}
