package com.deezer.research.language;

/**
 * Created by sc9 on 10/02/16.
 */
enum ErrorCode {
    NoTextError,
    FormatError,
    FileLoadError,
    DuplicateLangError,
    NeedLoadProfileError,
    CantDetectError,
    CantOpenTrainData,
    TrainDataFormatError,
    InitParamError;

    private ErrorCode() {
    }
}