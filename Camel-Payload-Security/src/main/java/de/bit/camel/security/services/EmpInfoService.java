package de.bit.camel.security.services;

import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import de.bit.camel.security.Signalement;

/**
 * 
 * @author Rami TORKHANI
 */
@WebService(serviceName = "EmpInfoService", targetNamespace = "http://services.bit.de/")
public interface EmpInfoService {
    @WebResult(name = "employee")
    Signalement EmployeeInfoService(@WebParam(name = "empId") String empId);
    }
