# Case 1 — High Allocation Rate
## Problem
Temporary object creation becomes very high and GC becomes frequent. Investigate allocation rate, request volume, GC and CPU.
## What You Know
GC frequency increases under load.
## Possible Causes
Request spike, object churn, allocation-heavy code path, or transient object bursts.
## What Should I Check?

## Investigation Path

## Possible Fix Directions

## Verification

## Engineering Questions

## My Investigation

## Evidence Collected

## Hypotheses Tested

## Root Cause

## Fix

## Verification Result

## Engineering Lesson

# Case 2 — Object Retention / Memory Leak
## Problem
Heap rises and GC cannot reclaim a large portion. Investigate retained objects, references, heap dump and dominant types.
## What You Know
Post-GC heap remains high and trends upward.
## Possible Causes
Retained references, long-lived containers, incorrect cache ownership, or leak-like retention.
## What Should I Check?

## Investigation Path

## Possible Fix Directions

## Verification

## Engineering Questions

## My Investigation

## Evidence Collected

## Hypotheses Tested

## Root Cause

## Fix

## Verification Result

## Engineering Lesson

# Case 3 — GC Pressure
## Problem
Increasing resources are spent on GC. Investigate allocation, heap occupancy, frequency, pauses, collector and workload.
## What You Know
CPU and latency show growing GC cost.
## Possible Causes
Allocation pressure, poor heap sizing, collector mismatch, or workload shift.
## What Should I Check?

## Investigation Path

## Possible Fix Directions

## Verification

## Engineering Questions

## My Investigation

## Evidence Collected

## Hypotheses Tested

## Root Cause

## Fix

## Verification Result

## Engineering Lesson

# Case 4 — Memory Grows Then Drops After GC
## Problem
Heap rises substantially, GC occurs, heap drops substantially. Developer claims memory leak. Investigate whether evidence supports retention or normal allocation behavior.
## What You Know
Memory graph has repeated rise-and-drop patterns.
## Possible Causes
Normal allocation/collection cycle, bursty traffic, or partial retention requiring deeper evidence.
## What Should I Check?

## Investigation Path

## Possible Fix Directions

## Verification

## Engineering Questions

## My Investigation

## Evidence Collected

## Hypotheses Tested

## Root Cause

## Fix

## Verification Result

## Engineering Lesson

# Case 5 — Long-Running Degradation
## Problem
Startup is fast; after hours latency increases; restart restores performance. Investigate heap, GC, allocation, retained objects, threads and workload over time.
## What You Know
Performance degrades over long uptime and resets after restart.
## Possible Causes
Accumulated retention, GC overhead increase, thread/resource buildup, or workload evolution.
## What Should I Check?

## Investigation Path

## Possible Fix Directions

## Verification

## Engineering Questions

## My Investigation

## Evidence Collected

## Hypotheses Tested

## Root Cause

## Fix

## Verification Result

## Engineering Lesson
