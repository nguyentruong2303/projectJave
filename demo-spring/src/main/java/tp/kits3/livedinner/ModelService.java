package tp.kits3.livedinner;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service // service means helper to Controller
//Controller  	<> Service 				<> Database between and controller and database
// req , resp 	logic/process				data storage
public class ModelService {

	private static final Logger logger = LoggerFactory.getLogger(ModelService.class);
	public ModelService() {
		logger.info("{}", "init");
	}
	//have to call after created instance
	public void getModelData() {
		logger.info("{}","get data");
	}
}
