package io.kodlama.core.utilities.result;

public class ErrorDataResult<T> extends DataResult<T> {
	// error'da data gönderilmesi ihtiyaçlar doğrultusunda front-end'in uygulaması
	// patlamaması için boş bir data vs gönderilebilir

	// Alternatif kullanımlar
	public ErrorDataResult(T data, String message) {
		super(data, false, message);
	}

	public ErrorDataResult(T data) {
		super(data, false);
	}

	public ErrorDataResult(String message) {
		super(null, false, message);
	}

	public ErrorDataResult() {
		super(null, false);
	}

}
