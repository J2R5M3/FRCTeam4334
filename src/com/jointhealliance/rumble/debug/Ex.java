package com.jointhealliance.rumble.debug;

/**
 * Exceptions class - contains all possible exceptions and their respective methods.
 * 
 * @author Joel Gallant
 */
public interface Ex {
    public abstract void printTrace();
    /**
     * No target found - used when looking for something specific and found nothing.
     */
    public static class NoTarget extends Exception implements Ex{
        private static final long serialVersionUID = 1L;
        /**
         * Error message.
         */
        public String m_error;
        
        /**
         * @param s Error message
         */
        public NoTarget(String s) {
            this.m_error = s;
        }
        
        /**
         * Prints m_error message.
         */
        @Override
        public synchronized void printTrace() {
            Log.write(m_error);
        }
        
    }
    /**
     * 
     */
    public static class ModuleDisabled extends Exception implements Ex{
        private static final long serialVersionUID = 1L;
        /**
         * Error message.
         */
        public String m_error;
        
        /**
         * @param s Error message.
         */
        public ModuleDisabled(String s) {
            this.m_error = s;
        }
        
        /**
         * Prints m_error message.
         */
        @Override
        public synchronized void printTrace() {
            Log.write(m_error+" disabled. Did not run commands.");
        }
    }
    /**
     * 
     */
    public static class SoftwareError extends Error implements Ex{
        private static final long serialVersionUID = 1L;
        /**
         * 
         */
        public String m_error;
        
        /**
         * 
         * @param s
         */
        public SoftwareError(String s) {
            this.m_error = s;
        }
        
        /**
         * 
         */
        @Override
        public synchronized void printTrace() {
            Log.write(m_error);
        }
        
    }

}
