package org.smart4j.chapter1.service;

import org.smart4j.chapter1.pojo.CustomerVO;

public interface ICustomerService {

	public CustomerVO add(CustomerVO customerVO) throws Exception;

	public CustomerVO delete(CustomerVO customerVO) throws Exception;

	public CustomerVO update(CustomerVO customerVO) throws Exception;

	public CustomerVO query(CustomerVO customerVO) throws Exception;

}
