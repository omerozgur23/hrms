package io.kodlama.core.utilities.result;

import lombok.Getter;

@Getter
public class DataResult<T> extends Result { // Döndürülecek data tipi değişebildiği için <T> kullanarak generic
											// oluşturuldu

	private T data;

	public DataResult(T data, boolean success, String message) {
		super(success, message);
		this.data = data;
	}

	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
	}

}
