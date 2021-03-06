/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.apache.eagle.jpm.mr.historyentity;

import org.apache.eagle.jpm.util.Constants;
import org.apache.eagle.jpm.util.jobcounter.JobCounters;
import org.apache.eagle.log.entity.meta.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Table("eaglejpa")
@ColumnFamily("f")
@Prefix("jexec")
@Service(Constants.MR_JOB_EXECUTION_SERVICE_NAME)
@TimeSeries(true)
@Partition({"site"})
@Indexes({
    @Index(name = "Index_1_jobId", columns = { "jobId" }, unique = true),
    @Index(name = "Index_2_jobDefId", columns = { "jobDefId" }, unique = false)
    })
public class JobExecutionAPIEntity extends JobBaseAPIEntity {
    @Column("a")
    private String currentState;
    @Column("b")
    private long startTime;
    @Column("c")
    private long endTime;
    @Column("d")
    private int numTotalMaps;
    @Column("e")
    private int numFailedMaps;
    @Column("f")
    private int numFinishedMaps;
    @Column("g")
    private int numTotalReduces;
    @Column("h")
    private int numFailedReduces;
    @Column("i")
    private int numFinishedReduces;
    @Column("j")
    private JobCounters jobCounters;
    @Column("k")
    private int dataLocalMaps;
    @Column("l")
    private double dataLocalMapsPercentage;
    @Column("m")
    private int rackLocalMaps;
    @Column("n")
    private double rackLocalMapsPercentage;
    @Column("o")
    private int totalLaunchedMaps;
    @Column("p")
    private long submissionTime;
    @Column("q")
    private long lastMapDuration;
    @Column("r")
    private long lastReduceDuration;
    @Column("s")
    private long durationTime;
    @Column("u")
    private double avgMapTaskDuration;
    @Column("v")
    private double avgReduceTaskDuration;
    @Column("w")
    private double maxMapTaskDuration;
    @Column("x")
    private double maxReduceTaskDuration;
    @Column("y")
    private int totalMapAttempts;
    @Column("z")
    private int failedMapAttempts;
    @Column("ab")
    private int totalReduceAttempts;
    @Column("ac")
    private int failedReduceAttempts;
    @Column("ad")
    private String trackingUrl;
    @Column("ae")
    private String diagnostics;

    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        valueChanged("trackingUrl");
    }

    public long getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(long durationTime) {
        this.durationTime = durationTime;
        valueChanged("durationTime");
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
        pcs.firePropertyChange("currentState", null, null);
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
        pcs.firePropertyChange("startTime", null, null);
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
        pcs.firePropertyChange("endTime", null, null);
    }

    public int getNumTotalMaps() {
        return numTotalMaps;
    }

    public void setNumTotalMaps(int numTotalMaps) {
        this.numTotalMaps = numTotalMaps;
        pcs.firePropertyChange("numTotalMaps", null, null);
    }

    public int getNumFailedMaps() {
        return numFailedMaps;
    }

    public void setNumFailedMaps(int numFailedMaps) {
        this.numFailedMaps = numFailedMaps;
        pcs.firePropertyChange("numFailedMaps", null, null);
    }

    public int getNumFinishedMaps() {
        return numFinishedMaps;
    }

    public void setNumFinishedMaps(int numFinishedMaps) {
        this.numFinishedMaps = numFinishedMaps;
        pcs.firePropertyChange("numFinishedMaps", null, null);
    }

    public int getNumTotalReduces() {
        return numTotalReduces;
    }

    public void setNumTotalReduces(int numTotalReduces) {
        this.numTotalReduces = numTotalReduces;
        pcs.firePropertyChange("numTotalReduces", null, null);
    }

    public int getNumFailedReduces() {
        return numFailedReduces;
    }

    public void setNumFailedReduces(int numFailedReduces) {
        this.numFailedReduces = numFailedReduces;
        pcs.firePropertyChange("numFailedReduces", null, null);
    }

    public int getNumFinishedReduces() {
        return numFinishedReduces;
    }

    public void setNumFinishedReduces(int numFinishedReduces) {
        this.numFinishedReduces = numFinishedReduces;
        pcs.firePropertyChange("numFinishedReduces", null, null);
    }

    public JobCounters getJobCounters() {
        return jobCounters;
    }

    public void setJobCounters(JobCounters jobCounters) {
        this.jobCounters = jobCounters;
        pcs.firePropertyChange("jobCounters", null, null);
    }

    public int getDataLocalMaps() {
        return dataLocalMaps;
    }

    public void setDataLocalMaps(int dataLocalMaps) {
        this.dataLocalMaps = dataLocalMaps;
        valueChanged("dataLocalMaps");
    }

    public double getDataLocalMapsPercentage() {
        return dataLocalMapsPercentage;
    }

    public void setDataLocalMapsPercentage(double dataLocalMapsPercentage) {
        this.dataLocalMapsPercentage = dataLocalMapsPercentage;
        valueChanged("dataLocalMapsPercentage");
    }

    public int getRackLocalMaps() {
        return rackLocalMaps;
    }

    public void setRackLocalMaps(int rackLocalMaps) {
        this.rackLocalMaps = rackLocalMaps;
        valueChanged("rackLocalMaps");
    }

    public double getRackLocalMapsPercentage() {
        return rackLocalMapsPercentage;
    }

    public void setRackLocalMapsPercentage(double rackLocalMapsPercentage) {
        this.rackLocalMapsPercentage = rackLocalMapsPercentage;
        valueChanged("rackLocalMapsPercentage");
    }

    public int getTotalLaunchedMaps() {
        return totalLaunchedMaps;
    }

    public void setTotalLaunchedMaps(int totalLaunchedMaps) {
        this.totalLaunchedMaps = totalLaunchedMaps;
        valueChanged("totalLaunchedMaps");
    }

    public long getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(long submissionTime) {
        this.submissionTime = submissionTime;
        valueChanged("submissionTime");
    }

    public long getLastMapDuration() {
        return lastMapDuration;
    }

    public void setLastMapDuration(long lastMapDuration) {
        this.lastMapDuration = lastMapDuration;
        valueChanged("lastMapDuration");
    }

    public long getLastReduceDuration() {
        return lastReduceDuration;
    }

    public void setLastReduceDuration(long lastReduceDuration) {
        this.lastReduceDuration = lastReduceDuration;
        valueChanged("lastReduceDuration");
    }

    public double getAvgMapTaskDuration() {
        return avgMapTaskDuration;
    }

    public void setAvgMapTaskDuration(double avgMapTaskDuration) {
        this.avgMapTaskDuration = avgMapTaskDuration;
        valueChanged("avgMapTaskDuration");
    }

    public double getAvgReduceTaskDuration() {
        return avgReduceTaskDuration;
    }

    public void setAvgReduceTaskDuration(double avgReduceTaskDuration) {
        this.avgReduceTaskDuration = avgReduceTaskDuration;
        valueChanged("avgReduceTaskDuration");
    }

    public double getMaxMapTaskDuration() {
        return maxMapTaskDuration;
    }

    public void setMaxMapTaskDuration(double maxMapTaskDuration) {
        this.maxMapTaskDuration = maxMapTaskDuration;
        valueChanged("maxMapTaskDuration");
    }

    public double getMaxReduceTaskDuration() {
        return maxReduceTaskDuration;
    }

    public void setMaxReduceTaskDuration(double maxReduceTaskDuration) {
        this.maxReduceTaskDuration = maxReduceTaskDuration;
        valueChanged("maxReduceTaskDuration");
    }

    public int getTotalMapAttempts() {
        return totalMapAttempts;
    }

    public void setTotalMapAttempts(int totalMapAttempts) {
        this.totalMapAttempts = totalMapAttempts;
        valueChanged("totalMapAttempts");
    }

    public int getFailedMapAttempts() {
        return failedMapAttempts;
    }

    public void setFailedMapAttempts(int failedMapAttempts) {
        this.failedMapAttempts = failedMapAttempts;
        valueChanged("failedMapAttempts");
    }

    public int getTotalReduceAttempts() {
        return totalReduceAttempts;
    }

    public void setTotalReduceAttempts(int totalReduceAttempts) {
        this.totalReduceAttempts = totalReduceAttempts;
        valueChanged("totalReduceAttempts");
    }

    public int getFailedReduceAttempts() {
        return failedReduceAttempts;
    }

    public void setFailedReduceAttempts(int failedReduceAttempts) {
        this.failedReduceAttempts = failedReduceAttempts;
        valueChanged("failedReduceAttempts");
    }

    public String getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(String diagnostics) {
        this.diagnostics = diagnostics;
        valueChanged("diagnostics");
    }
}
