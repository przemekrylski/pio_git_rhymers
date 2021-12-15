package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

	public interface RhymersFactoryInterface {
	
		public DefaultCountingOutRhymer getStandardRhymer();
		
		public DefaultCountingOutRhymer getFalseRhymer();
		
		public DefaultCountingOutRhymer getFIFORhymer();
		
		public DefaultCountingOutRhymer getHanoiRhymer();
		
	}
