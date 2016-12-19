package com.focustech.focus3d.agent.rpc.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.focustech.focus3d.agent.rpc.service.AgentRpcService;
/**
 *
 * *
 * @author lihaijun
 *
 */
@Service
public class AgentRpcServiceImpl implements AgentRpcService {

	private Map<String, Object> cache = new HashMap<String, Object>();

	private ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);

	@PostConstruct
	public void init(){
		pool.scheduleAtFixedRate(new Runnable() {
			Map<String, Object> cacheTmp = new HashMap<String, Object>();
			@Override
			public void run() {
				
			}
		}, 15, 1200, TimeUnit.SECONDS);
	}

	@Override
	public boolean searchAgent(String key) {
		return cache.containsKey(key);
	}
}
