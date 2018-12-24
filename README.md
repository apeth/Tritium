# Tritium | Play Framework (Scala)
Tritium is a simple RESTful web service built using the Play Framework (Scala).

### Requirements / Dependencies
| Simple Build Tool (sbt) | v1.1.1+ |
| Java                    | v1.8    |

#### How to test
Execute `sbt clean coverage test coverageReport`

#### How to run
Execute `sbt run`
Visit http://localhost:9000/v1/stock

#### How to build
Execute:
`cd tritium`
`sbt`
`universal:packageZipTarball` or `dist` for non-Unix systems (excluding OSX).
