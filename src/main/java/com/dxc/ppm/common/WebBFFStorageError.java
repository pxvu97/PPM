package com.dxc.ppm.common;

import org.springframework.http.HttpStatus;

public enum  WebBFFStorageError {

        PATIENT_ID_IS_NULL_OR_CONTAINS_SPACE(0, HttpStatus.NOT_FOUND),
        INVALID_INPUT_PATIENT_INFO(1, HttpStatus.BAD_REQUEST),
        INVALID_INPUT_PATIENT_MEDICAL_PROFILE(3, HttpStatus.BAD_REQUEST),
        MEDICINE_NAME_IS_NULL(4, HttpStatus.BAD_REQUEST);

        private final int code;
        private final HttpStatus httpStatus;

        WebBFFStorageError(int code, HttpStatus httpStatus) {
            this.code = code;
            this.httpStatus = httpStatus;
        }

        public int getCode() {
            return code;
        }

        public HttpStatus getHttpStatus() {
            return httpStatus;
        }
}
