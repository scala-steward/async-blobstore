/*
 * Copyright 2020 Precog Data
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package quasar.blobstore

import scala.Predef.String
import scala.collection.immutable.List

object paths {

  final case class PathElem(value: String)

  type Path = List[PathElem]

  trait BlobstorePath {
    def path: Path
  }

  final case class PrefixPath(path: Path) extends BlobstorePath
  final case class BlobPath(path: Path) extends BlobstorePath
}
