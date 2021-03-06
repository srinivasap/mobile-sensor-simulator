// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: waterqualitysensor.proto

package com.mobile.sensor.cloud.waterquality;

public interface WaterSensorDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:WaterSensorData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.WaterSensorDetails sensorDetails = 1;</code>
   */
  boolean hasSensorDetails();
  /**
   * <code>.WaterSensorDetails sensorDetails = 1;</code>
   */
  com.mobile.sensor.cloud.waterquality.WaterSensorDetails getSensorDetails();
  /**
   * <code>.WaterSensorDetails sensorDetails = 1;</code>
   */
  com.mobile.sensor.cloud.waterquality.WaterSensorDetailsOrBuilder getSensorDetailsOrBuilder();

  /**
   * <code>float pressure = 2;</code>
   */
  float getPressure();

  /**
   * <code>float temparature = 3;</code>
   */
  float getTemparature();

  /**
   * <code>float tidespeed = 4;</code>
   */
  float getTidespeed();

  /**
   * <pre>
   * value and parameter type
   * </pre>
   *
   * <code>map&lt;string, .WaterParameter&gt; parameters = 5;</code>
   */
  int getParametersCount();
  /**
   * <pre>
   * value and parameter type
   * </pre>
   *
   * <code>map&lt;string, .WaterParameter&gt; parameters = 5;</code>
   */
  boolean containsParameters(
      java.lang.String key);
  /**
   * Use {@link #getParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.mobile.sensor.cloud.waterquality.WaterParameter>
  getParameters();
  /**
   * <pre>
   * value and parameter type
   * </pre>
   *
   * <code>map&lt;string, .WaterParameter&gt; parameters = 5;</code>
   */
  java.util.Map<java.lang.String, com.mobile.sensor.cloud.waterquality.WaterParameter>
  getParametersMap();
  /**
   * <pre>
   * value and parameter type
   * </pre>
   *
   * <code>map&lt;string, .WaterParameter&gt; parameters = 5;</code>
   */

  com.mobile.sensor.cloud.waterquality.WaterParameter getParametersOrDefault(
      java.lang.String key,
      com.mobile.sensor.cloud.waterquality.WaterParameter defaultValue);
  /**
   * <pre>
   * value and parameter type
   * </pre>
   *
   * <code>map&lt;string, .WaterParameter&gt; parameters = 5;</code>
   */

  com.mobile.sensor.cloud.waterquality.WaterParameter getParametersOrThrow(
      java.lang.String key);

  /**
   * <code>string recordedTime = 6;</code>
   */
  java.lang.String getRecordedTime();
  /**
   * <code>string recordedTime = 6;</code>
   */
  com.google.protobuf.ByteString
      getRecordedTimeBytes();

  /**
   * <code>.WaterSensorData.State state = 7;</code>
   */
  int getStateValue();
  /**
   * <code>.WaterSensorData.State state = 7;</code>
   */
  com.mobile.sensor.cloud.waterquality.WaterSensorData.State getState();
}
