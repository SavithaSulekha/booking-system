import { render } from '@testing-library/react';
import React, { Component }  from 'react';
import sampleImage from '../logo.svg';
import "./DeviceRow.css"

class DeviceRow extends Component {
    render() {
        return (
            <div className="product">
                <span className="imagePhn">
                  <img src={sampleImage} alt="Image" />
                </span>
                <span className="data">
                    <b>{this.props.name}</b>({this.props.description})
                    {this.props.status === "Booked" ? <div><b>Booked By : </b>{this.props.bookedBy}</div> : null}
                    {this.props.status === "Booked" ? <div><b>Next Available : </b>{this.props.nextAvailable}</div> : null}
                    {this.props.status === "Available" ? <button className="bookButton">
              Book Device
            </button> : null}  
            </span>
            </div>
          );
    }
  
}

export default DeviceRow;