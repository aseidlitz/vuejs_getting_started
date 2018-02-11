package com.etcoleman.sample.jsonServer.messages;

public class FateTransaction {

  private final String duration;
  private final String txId;
  private final String tableId;
  private final String tableName;
  private final String reason;
  private final String startTime;
  private final String updateTime;

  public FateTransaction() {
    this.duration = "0";
    this.txId = "12345678";
    this.tableId = "123";
    this.tableName = "tableA";
    this.reason = "compaction";
    this.startTime = "2018-02-10T01:23:56";
    this.updateTime = "2018-02-10T02:34:56";
  }

  public String getDuration() {
    return duration;
  }

  public String getTxId() {
    return txId;
  }

  public String getTableId() {
    return tableId;
  }

  public String getTableName() {
    return tableName;
  }

  public String getReason() {
    return reason;
  }

  public String getStartTime() {
    return startTime;
  }

  public String getUpdateTime() {
    return updateTime;
  }
}
