// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsBodyComplex.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// </summary>
    [JsonObject("cookiecuttershark")]
    public partial class Cookiecuttershark : Shark
    {
        /// <summary>
        /// Initializes a new instance of the Cookiecuttershark class.
        /// </summary>
        public Cookiecuttershark() { }

        /// <summary>
        /// Initializes a new instance of the Cookiecuttershark class.
        /// </summary>
        public Cookiecuttershark(double? length, DateTime? birthday, string species = default(string), IList<Fish> siblings = default(IList<Fish>), int? age = default(int?))
            : base(length, birthday, species, siblings, age)
        {
        }

        /// <summary>
        /// Validate the object. Throws ArgumentException or ArgumentNullException if validation fails.
        /// </summary>
        public override void Validate()
        {
            base.Validate();
        }
    }
}