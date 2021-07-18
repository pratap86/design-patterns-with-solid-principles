package com.pratap.designpatterns.behaviour.iterator;
/**
 * This enum represent the aggregate from iterator pattern
 * @author Pratap Narayan
 *
 */
public enum ThemeColor {

	RED,
	ORANGE,
	BLACK,
	WHITE;
	
	public static Iterator<ThemeColor> getIterator(){
		return new ThemeColorIterator();
	}
	
	private static class ThemeColorIterator implements Iterator<ThemeColor> {
		
		// An iterator maintain the state
		private int position;

		@Override
		public boolean hasNext() {
			return position < ThemeColor.values().length;//ie. next element is available in aggregate
		}

		@Override
		public ThemeColor next() {
			return ThemeColor.values()[position++];
		}
		
	}
}
