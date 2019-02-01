package br.com.gustavosimoes.magazine.exception;

public class ServiceException extends Exception {

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable throwable){
        super(throwable);
    }

    public ServiceException(String message, Throwable throwable){
        super(message,throwable);
    }
}
