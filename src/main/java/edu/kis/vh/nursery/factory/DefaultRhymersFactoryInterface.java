package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

	public interface DefaultRhymersFactoryInterface {
	
		public DefaultCountingOutRhymer GetStandardRhymer();
		
		public DefaultCountingOutRhymer GetFalseRhymer();
		
		public DefaultCountingOutRhymer GetFIFORhymer();
		
		public DefaultCountingOutRhymer GetHanoiRhymer();
		
	}
