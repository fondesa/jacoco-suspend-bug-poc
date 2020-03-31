**Specs:**
- Jacoco version: 0.8.5 / 0.8.6.202003291235 (snapshot)
- Kotlin version: 1.3.71
- Coroutines version: 1.3.5

**Description**

The closing branch of a Unit suspend function which invokes another Unit suspend function as the last instruction, is always marked as not covered.

To reproduce this bug, launch the task `jacocoTestReport` and look at the report into `build/reports/jacoco/test/html`.