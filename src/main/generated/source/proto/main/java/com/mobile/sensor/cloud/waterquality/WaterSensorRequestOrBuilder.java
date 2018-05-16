// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: waterqualitysensor.proto

package com.mobile.sensor.cloud.waterquality;

public interface WaterSensorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:WaterSensorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string authToken = 1;</code>
   */
  java.lang.String getAuthToken();
  /**
   * <code>string authToken = 1;</code>
   */
  com.google.protobuf.ByteString
      getAuthTokenBytes();

  /**
   * <pre>
   * indicating last 10 sec, 5 mins, 1 hrs etc in combination with timeUnit
   * </pre>
   *
   * <code>int32 timeSpan = 2;</code>
   */
  int getTimeSpan();

  /**
   * <code>.WaterSensorRequest.TimeUnit timeUnit = 3;</code>
   */
  int getTimeUnitValue();
  /**
   * <code>.WaterSensorRequest.TimeUnit timeUnit = 3;</code>
   */
  com.mobile.sensor.cloud.waterquality.WaterSensorRequest.TimeUnit getTimeUnit();
}