package com.practice.data;

import com.practice.entity.Practice;
import java.util.*;
public interface PracticeService {

	public Practice createPrac(Practice practice);
	
	public List<Practice> getAll();
}
