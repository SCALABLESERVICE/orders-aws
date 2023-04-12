/**
  * Orders
  * Service for processing orders
  *
  * OpenAPI spec version:
  *
  *
  * NOTE: This class is auto generated by the swagger code generator program.
  * https://github.com/swagger-api/swagger-codegen.git
  * Do not edit the class manually.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */

package works.weave.socks.aws.orders.presentation.value

import java.net.URI
import works.weave.socks.aws.orders.domain.GOrder
import works.weave.socks.aws.orders.domain.GOrderTypes

case class OrderRequest(
  id : String,
  customerId : String,
  customer : URI, // Swagger: OrderCustomer,
  address : URI, // Swagger: OrderAddress,
  card : URI, // Swagger: OrderCard,
  items : URI, // Swagger: List[OrderItems],
  shipment : URI,
  date : String,
  total : Number) extends GOrder[Order.Minimal]

case class Order(
  id : String,
  customerId : String,
  customer : OrderCustomer,
  address : OrderAddress,
  card : OrderCard,
  items : List[OrderItems],
  shipment : Option[OrderShipment],
  date : String,
  total : Number,
  _links : OrderLinks) extends GOrder[Order.Full]

object Order {
  trait Full extends GOrderTypes {
    override type Customer = OrderCustomer
    override type Address = OrderAddress
    override type Card = OrderCard
    override type Items = List[OrderItems]
    override type Shipment = Option[OrderShipment]
  }

  trait Minimal extends GOrderTypes {
    type Customer = URI
    type Address = URI
    type Card = URI
    type Items = URI
    type Shipment = URI
  }
}

case class OrderLinks(
  self : LinksSelf)